package com.calibermc.caliber.fabric;

import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.authlib.minecraft.client.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class CaliberHelperImpl {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    // Using this because fabric doesn't have any type of config
    public static void setBlockStateMode(int mode) {
        ObjectMapper mapper = new ObjectMapper(GSON);

        //Read from config
        JsonObject root = mapper.readValue(CaliberCommonConfigs.SPEC.getFullPath().toString(), JsonObject.class);

        if (root.has("Configs for Caliber Mod")) {
            JsonObject jsonObject = root.get("Configs for Caliber Mod").getAsJsonObject();
            int val = jsonObject.get("mode_blockstates").getAsInt();
            //Compare values
            if (val != mode) {
                //Update value in object
                root.add("mode_blockstates", new JsonPrimitive(mode));

                //Write into the file
                try (FileWriter file = new FileWriter(CaliberCommonConfigs.SPEC.getFullPath().toFile())) {
                    file.write(root.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
