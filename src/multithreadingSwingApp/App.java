package multithreadingSwingApp;

import semaphores.Connection;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws InterruptedException {
        SwingUtilities.invokeLater(() -> new MainFrame("SwingWorker Demo"));
    }
}
