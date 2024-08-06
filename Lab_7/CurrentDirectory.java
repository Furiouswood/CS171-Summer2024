package Lab_7;

import java.io.IOException;

public class CurrentDirectory {
    public static void main(String[] args) throws IOException {
        // in this example, absolute path is currentDirectory + relative path
        // we have two options, we can use absolute path or relative path.

        String currentWorkingDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentWorkingDirectory);
        String mazeOneRelativePath = "A3/canvas/maze1.txt";
        String mazeOneAbsolutePath = currentWorkingDirectory + "/" +
                mazeOneRelativePath;

        System.out.println("Absolute path of maze1.txt: " + mazeOneAbsolutePath);
        System.out.println("Relative path of maze1.txt: " + mazeOneRelativePath);

        char[][] mazeOne = A3.practice.PathFinderStarter.readMaze(mazeOneAbsolutePath);
        char[][] mazeTwo = A3.practice.PathFinderStarter.readMaze("A3/canvas/maze2.txt");
        char[][] mazeRoot = A3.practice.PathFinderStarter.readMaze("maze1.txt"); // root directory

    }
}
