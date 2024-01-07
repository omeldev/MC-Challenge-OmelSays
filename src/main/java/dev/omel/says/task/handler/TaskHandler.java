package dev.omel.says.task.handler;

import dev.omel.says.main.Main;
import dev.omel.says.task.ChallengeTask;
import dev.omel.says.task.tasks.KillMob;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public final class TaskHandler {

    private static TaskHandler instance;

    private List<ChallengeTask> tasks = new ArrayList<>();

    public static TaskHandler getInstance() {
        if(instance == null) instance = new TaskHandler();
        return instance;
    }

    private TaskHandler() {
        ChallengeTask killMob = new KillMob(10);

        killMob.setConsumer((b, p) -> {
            System.out.println("KillMob: " + b);
            System.out.println("KillMob: " + p.getName());
        });


        tasks.add(killMob);
    }

    public void nextTask() {

        ChallengeTask task = tasks.get(0); //TODO: random

        Main.getInstance().getServer().getPluginManager().registerEvents((Listener) task, Main.getInstance());

    }

}
