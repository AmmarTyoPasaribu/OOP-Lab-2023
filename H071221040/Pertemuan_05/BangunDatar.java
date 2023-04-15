public class BangunDatar {
    
    double getVolume() {
        return 0;
    }

    double getLuasPermukaan() {
        return 0;
    }
}

class Kubus extends BangunDatar{
    int sisi;

    double getVolume(){
        return sisi*sisi*sisi;
    }

    double getLuasPermukaan() {
        return 6*(sisi*sisi);
    }
}

class Balok extends BangunDatar {
    int panjang;
    int lebar;
    int tinggi;

    double getVolume() {
        return panjang*lebar*tinggi;
    }

    double getLuasPermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}

class Bola extends BangunDatar {
    int jarijari;

    double getVolume() {
        return Math.PI*(jarijari*jarijari);
    }

    double getLuasPermukaan() {
        return (4/3)*Math.PI*(jarijari*jarijari*jarijari);
    }
}

class Tabung extends BangunDatar {
    int tinggi;
    int jarijari;

    double getVolume() {
        return Math.PI*(jarijari*jarijari)*tinggi;
    }

    double getluasPermukaan() {
        return (2*Math.PI*jarijari*tinggi) + (2*Math.PI*(jarijari*jarijari));
    }
}

