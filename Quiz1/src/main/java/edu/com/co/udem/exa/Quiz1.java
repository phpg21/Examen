

package edu.com.co.udem.exa;

import edu.com.co.udem.especies.Cebolla;
import edu.com.co.udem.especies.Lechuga;
import edu.com.co.udem.especies.Naranja;
import edu.com.co.udem.interfaces.Reino;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author b12s309
 */
public class Quiz1 {

    public static void main(String[] args) {
        List<Reino> lista = new ArrayList<>();
        lista.add(new Cebolla("Cebollita",1," Vegetal",2));
        lista.add(new Lechuga("Lechuguita",1," Vegetal",3));
        lista.add(new Naranja("Naranjita",1," Vegetal",2));
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).toString());
        }
    }
}
