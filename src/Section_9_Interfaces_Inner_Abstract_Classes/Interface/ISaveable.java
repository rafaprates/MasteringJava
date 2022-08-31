package Section_9_Interfaces_Inner_Abstract_Classes.Interface;

import java.util.List;

public interface ISaveable {
    List<String> write();
    List<String> read(List<String> parameters);
}
