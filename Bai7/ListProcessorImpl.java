package ss19.Bai7;

import java.util.List;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public boolean containsNegative(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                return true;
            }
        }
        return false;
    }
}
