package H071221005.Pertemuan_05.assignment_05_01;

import java.lang.Math;
public class Bola extends BangunRuang {
    
    public Bola(double panjang) {
        super(panjang);
    }
    public double LuasBola(){
        return (4 * 3.14 * Math.pow(getPanjang(), 2));
    }

    public double VolBola(){
        return (4  * 3.14 *  Math.pow(getPanjang(), 3)) / 3;
    }    
    }
