package maturaOgolne.zadanieCzwarte;

import java.util.Comparator;

public class PromienComparator implements Comparator<Okrag> {

    @Override
    public int compare(Okrag o1, Okrag o2) {
        return o1.getR() - o2.getR();
    }
}
