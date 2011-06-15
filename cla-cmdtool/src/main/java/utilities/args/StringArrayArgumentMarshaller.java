package utilities.args;

import java.util.Iterator;

public class StringArrayArgumentMarshaller implements ArgumentMarshaller {

    public void set(Iterator<String> currentArgument) throws ArgsException {
    }

    public static String[] getValue(ArgumentMarshaller argumentMarshaller) {
        return new String[0];
    }
}
