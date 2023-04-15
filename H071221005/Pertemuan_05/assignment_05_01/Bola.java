package H071221005.Pertemuan_05.assignment_05_01;

import java.lang.Math;
public class Bola extends BangunRuang {
    public double LuasBola(){
        return (4 * 3.14 * Math.pow(getJari(), 2));
    }

    public double VolBola(){
        return (4  * 3.14 *  Math.pow(getJari(), 3)) / 3;
    }    
    }
