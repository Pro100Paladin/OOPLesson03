package pharmacy;

import org.jetbrains.annotations.NotNull;

public interface Copmparable<Pharmacy> {



    default int compareTo(@NotNull Component o) {
        return Integer.compare(o.power, this.compareTo(o));
    }

}
