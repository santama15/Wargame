package cards;

import java.util.ArrayList;

public enum Rank {
    dwójka (2),
    trójka (3),
    czwórka (4),
    piątka (5),
    szóstka (6),
    siódemka (7),
    ósemka (8),
    dziewiątka (9),
    dziesiątka (10),
    jopek (11),
    dama (12),
    król (13),
    as (14);

    private int strong;

    Rank(int strong) {
        this.strong = strong;
    }
    public int getStrong() {
        return strong;
    }


    @Override
    public String toString() {
        return "Rank{" +
                ", strong=" + strong +
                '}';
    }
}

