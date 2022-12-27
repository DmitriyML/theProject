package org.example;

import java.util.HashSet;
import java.util.Set;

public class SymbolGroup {
    /*  какие символы составляют группу */
    char[] symbolBase ;

    /* символы, использованные в пароле */
    Set<Character> utilized ;

    /*  текущий размер utilized*/
    int size;

    public SymbolGroup(char[] symbolBase) {
        this.symbolBase = symbolBase;
        this.utilized = new HashSet<>();
        this.size = this.utilized.size();
    }

    void getNextSymbol() {
        for(Character symbol:symbolBase) {
            if(utilized.contains(symbol)){
                continue;
            }
            else {
                utilized.add(symbol);
                size = utilized.size();
                break;
            }
        }
    }
}