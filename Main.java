class Main {
    public static void main (String[] args){
        int [][] predio = new int[10][8];
        preencheMat(predio);
        mostraMat(predio);
        int vazios = calcVazios(predio);
        System.out.println("Quantidade de apartamentos vazios: " + vazios);
        int andarMaior = calcAndar(predio);
        System.out.println("Andar com maior número de moradores: " + (andarMaior + 1));
        int totalMoradores = calcTotal(predio);
        System.out.println("Quantidade total de moradores: " + totalMoradores);
    }

    public static int calcVazios(int [][]predio){
        int vazios = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                if (predio[i][j] == 0) {
                    vazios++;
                }
            }
        }
        return vazios;
    }

    public static void preencheMat(int[][] predio){
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                predio[i][j] = (int) (Math.random() * 7);
            }
        }
    }

    public static void mostraMat(int[][] predio){
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                System.out.print(predio[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int calcAndar(int[][] predio) {
        int andarMaior = 0;
        int maxMoradores = 0;
        for (int i = 0; i < predio.length; i++) {
            int totalMoradoresAndar = 0;
            for (int j = 0; j < predio[i].length; j++) {
                totalMoradoresAndar += predio[i][j];
            }
            if (totalMoradoresAndar > maxMoradores) {
                maxMoradores = totalMoradoresAndar;
                andarMaior = i;
            }
        }
        return andarMaior;
    }

    public static int calcTotal(int[][] predio) {
        int totalMoradores = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                totalMoradores += predio[i][j];
            }
        }
        return totalMoradores;
    }
}