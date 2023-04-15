public class BangunRuang {
    
    double getLuas() {
        return 0;
    }

    double getKeliling() {
        return 0;
    }
}

class Persegi extends BangunRuang{
    int sisi;

    double getLuas() {
        return sisi*sisi;
    }

    double getKeliling() {
        return 4*sisi;
    }
}

class PersegiPanjang extends BangunRuang {
    int panjang;
    int lebar;

    double getLuas() {
        return panjang*lebar;
    }

    double getKeliling() {
        return 2*(panjang+lebar);
    }
}

class Lingkaran extends BangunRuang {
    int jarijari;

    double getluas() {
        return Math.PI*(jarijari*jarijari);
    }
    double getkeliling() {
        return 2*Math.PI*jarijari;
    }
}

class Segitiga extends BangunRuang {
    int alas;
    int tinggi;
    int sisi;

    double getluas() {
        return 1/2*(alas*tinggi);
    }
    double getkeliling() {
        return 3*sisi;
    }
}

class Trapesium extends BangunRuang {
    int alas1;
    int alas2;
    int tinggi;
    int rusuk1;
    int rusuk2;

    double getluas() {
        return 1/2*(alas1+alas2)*tinggi;
    }
    double getkeliling() {
        return rusuk1+rusuk2+alas1+alas2;
    }
}
