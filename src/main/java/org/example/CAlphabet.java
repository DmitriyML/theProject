package org.example;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class CAlphabet
{
    /*  набор символов ASCII , которых не должно быть
        в сгенеренном паролле   */
    Set<Character> forbidden;


    /*   набор символов ASCII , из которых должен быть
        составден паролле   */
    Map<Byte, Character> alphabet;


    /*  создаёт набор символов, которые запрещено использовать в создании пароля*/
    public void setForbidden(Set<Character> ex) {
        ex.add('!');
        ex.add('"');
        ex.add('\'');
        ex.add('*');
        ex.add('+');
        ex.add(',');
        ex.add('-');
        ex.add('.');
        ex.add(';');
        ex.add('=');
        ex.add('O');
        ex.add('[');
        ex.add(']');
        ex.add('^');
        ex.add('_');
        ex.add('`');
        ex.add('l');
        ex.add('~');

    }

    public CAlphabet() {
        this.alphabet = new Hashtable<>() ;
        this.forbidden = new HashSet<Character>() ;
        this.setForbidden(this.forbidden) ;
        byte j = 0 ;
        for(char i = 0x0020; i < 0x007f ; i++ ){
            if(forbidden.contains(i)){
                continue;
            }
            else {
                this.alphabet.put(j,i);
                j++;
            }
        }
    }
}
