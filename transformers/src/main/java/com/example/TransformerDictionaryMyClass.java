package com.example;

public class TransformerDictionaryMyClass {

    public static void main(String[] args) {

        String[][] Transformers = new String[20][2];
        Transformers[0][0] = "Decepticon";
        Transformers[0][1] = " = ShockWave";
        Transformers[1][0] = "Decepticon";
        Transformers[1][1] = " = Soundwave";
        Transformers[2][0] = "Autobot";
        Transformers[2][1] = " = Bumblebee";
        Transformers[3][0] = "Autobot";
        Transformers[3][1] = " = Cliffjumper";
        Transformers[4][0] = "Decepticon";
        Transformers[4][1] = " = Megatron";
        Transformers[5][0] = "Autobot";
        Transformers[5][1] = " = Optimus Prime";
        Transformers[6][0] = "Autobot";
        Transformers[6][1] = " = Sideswipe";
        Transformers[7][0] = "Decepticon";
        Transformers[7][1] = " = Dirge";
        Transformers[8][0] = "Decepticon";
        Transformers[8][1] = " = Thundercracker";
        Transformers[9][0] = "Autobot";
        Transformers[9][1] = " = Sunstreaker";
        Transformers[10][0] = "Autobot";
        Transformers[10][1] = " = Smokescreen";
        Transformers[11][0] = "Decepticon";
        Transformers[11][1] = " = Skywarp";
        Transformers[12][0] = "Decepticon";
        Transformers[12][1] = " = Starscream";
        Transformers[13][0] = "Decepticon";
        Transformers[13][1] = " = Thrust";
        Transformers[14][0] = "Decepticon";
        Transformers[14][1] = " = Ramjet";
        Transformers[15][0] = "Autobot";
        Transformers[15][1] = " = Mirage";
        Transformers[16][0] = "Autobot";
        Transformers[16][1] = " = Jazz";
        Transformers[17][0] = "Autobot";
        Transformers[17][1] = " = Prowl";
        Transformers[18][0] = "Decepticon";
        Transformers[18][1] = " = Rumble";
        Transformers[19][0] = "Autobot";
        Transformers[19][1] = " = Grimlock";


        for (int i = 0; i < Transformers.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < Transformers[i].length; j++) {
                sb.append(Transformers[i][j]);
            }
            System.out.println(sb);
        }
        //Dictionary List of my Transformer Collection


        // Print all the array elements
        double[] hoursTvWatched = {1,2,3,3.30,0.30,4,5,1.30,
                2.30,0.30,3.30,3.30,3,2.30,1,5,2.30,0.30,0,1.30,4,2.30,
                2,3,3.0,3.0,1,0,2.30,2,4};

        // Print all the array elements
        for (int i = 0; i < hoursTvWatched.length; i++) {
            System.out.println(hoursTvWatched[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < hoursTvWatched.length; i++) {
            total += hoursTvWatched[i];
        }
        System.out.println("Total hours of TV watched this month " + total);

        
    }
}