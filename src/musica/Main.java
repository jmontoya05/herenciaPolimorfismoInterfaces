package musica;

public class Main {
    public static void main(String[] args) {
        PlataformaVirtual plataforma1 = new PlataformaVirtual("Spotify");
        PlataformaVirtual plataforma2 = new PlataformaVirtual("YouTube Music");

        ReproductorMP3 mp3v1 = new ReproductorMP3("Sony NW");
        ReproductorMP3 mp3v2 = new ReproductorMP3("Ipod");

        System.out.println(plataforma1.getNombre());
        plataforma1.reproducirMusica();
        plataforma1.reproducirMusica();
        plataforma1.pausarMusica();
        System.out.println(plataforma2.getNombre());
        plataforma2.detenerMusica();
        plataforma2.reproducirMusica();

        System.out.println(mp3v1.getNombre());
        mp3v1.pausarMusica();
        mp3v1.detenerMusica();
        mp3v1.reproducirMusica();

        System.out.println(mp3v2.getNombre());
        mp3v2.reproducirMusica();
        mp3v2.reproducirMusica();
        mp3v2.pausarMusica();
    }
}
