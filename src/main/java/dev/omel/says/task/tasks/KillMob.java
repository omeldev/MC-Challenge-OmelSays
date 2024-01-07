package dev.omel.says.task.tasks;

import dev.omel.says.task.ChallengeTask;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.function.Consumer;

public class KillMob extends ChallengeTask implements Listener {

    public KillMob(int timeInSeconds) {
        super(timeInSeconds);
    }

    @EventHandler
    public void onKillMob(EntityDeathEvent event) {
        if (event.getEntity() instanceof Zombie)
            consumer.accept(true);
        else consumer.accept(false);
    }


}
