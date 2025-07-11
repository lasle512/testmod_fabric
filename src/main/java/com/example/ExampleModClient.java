package main.java.com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin; // Изменено
import net.minecraft.client.render.model.json.ModelIdentifier; // Изменено
import net.minecraft.util.Identifier;

public class ExampleModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingPlugin.register(pluginContext -> {
            pluginContext.addModels(new ModelIdentifier(Identifier.of("mymod", "test_item"), "inventory"));
        });
    }
}