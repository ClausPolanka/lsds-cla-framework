package lsds.cla;

import utilities.args.Args;
import utilities.args.ArgsException;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        try {
            Args clientArgs = new Args("v", args);
            System.out.println(format("Verbose enabled? %b", clientArgs.getBoolean('v')));
        } catch (ArgsException e) {
            e.printStackTrace();
        }
    }
}
