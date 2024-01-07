package dev.omel.says.task.tasks;

import dev.omel.says.task.ChallengeTask;
import dev.omel.says.task.player.TaskPlayer;
import org.bukkit.entity.Player;
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
        if (event.getEntity().getKiller() == null) return;
        if (!(event.getEntity().getKiller() instanceof Player)) return;
        if (event.getEntity() instanceof Zombie) consumer.accept(true, event.getEntity().getKiller());
        else consumer.accept(false, event.getEntity().getKiller());


    }


}
