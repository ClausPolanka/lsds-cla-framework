package utilities.args;

import java.util.Iterator;

public interface ArgumentMarshaller {
    public void set(Iterator<String> currentArgument) throws ArgsException;
}
