package zestaw8.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Main {

    //PLEASE RUN RIAK KV DATABASE ON PORT 8098 BEFORE RUNNING THIS PROGRAM
    public static void main(String[] args) {
        //create and view resource
        System.out.println("CREATING RIAK RESOURCE");
        runCommand(RiakCommands.CREATE_COMMAND);
        //modify and view resource
        System.out.println("MODIFYING RIAK RESOURCE ADDING COLOR FIELD");
        runCommand(RiakCommands.MODIFY_COMMAND);
        //delete resource and try to read it
        System.out.println("DELETING RIAK RESOURCE - ON GET SHOULD RETURN NOT FOUND");
        runCommand(RiakCommands.DELETE_COMMAND);
    }

    private static void runCommand(String command) {
        ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
        try {
            Process process = processBuilder.start();
            process.waitFor();
            System.out.println(process.exitValue());
            process.destroy();
            processBuilder.command(RiakCommands.GET_COMMAND.split(" "));
            process = processBuilder.start();
            InputStream getInputStream = process.getInputStream();
            String returnText = new BufferedReader(
                    new InputStreamReader(getInputStream, StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(returnText);
        } catch (IOException | InterruptedException ioe) {
            ioe.printStackTrace();
        }
    }

}
