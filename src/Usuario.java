public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual? " + smartTv.canal);



    }
}
