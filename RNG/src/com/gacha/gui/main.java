package com.gacha.gui;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    private JPanel mainPanel;
    private JComboBox role;
    private JTextArea output;
    private JButton GENERATEButton;

    public main() {
        GENERATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] Asasin = {"Harley", "Kadita", "Ling", "Lancelot", "Hanzp", "Selena", "Gusiion", "Hayabusa", "Natalia", "Lesly", "Lapu-lapu", "Helcurt", "Yi Shun-shin", "Karina",
                "Saber", "Fanny", "Zilong", "Alucard", "Benedeta", "Aamon"};
                String[] Fighter = {"Ruby", "Minsitthar", "Argus", "Thamuz", "Khaleed", "Silvana", "Yu Zhong", "Barats", "Masha", "Kaja", "Aldous", "Jawhead", "Leomord", "Guinivere", "Badang", "X Borg", "Terizla", "Dyroth", "Gatotkaca", "Lapu-lapu", "Sun", "Alpha", "Freya", "Chou", "Roger", "Hilda", "Balmond", "Bane", "Zilong", "Alucard", "Phoveos", "Paquito", "Yin", "Aulus"};
                String[] Tank = {"Ruby", "Atlas", "Barats", "Baxia", "Grock", "Lolita", "Jonshon", "Esmelarda", "Hylos", "Beleric", "Urnus", "Khufra", "Gatot Kaca",
                        "Hilda", "Minotour", "Balmond" , "Tigriel", "Akai", "Franco", "Gloo", "Edith"};
                String[] MM = {"Claude", "Kimmy", "Popol & Kupa", "Yi Shun-shin", "Moskov", "Wanwan", "Lesley", "Granger", "Hanabi", "Iritel", "Roger", "Karrie", "Bruno", "Layla", "Clint", "Miya", "Brody",
                "Beatrix", "Natan", "Melissa"};
                String[] Mage = {"Harley", "Chang'e", "Vale", "Kimmy", "Kadita", "Faramis", "Cecilion", "Lou Yi", "Valir", "Parsha", "Zhask", "Selena", "Harith", "Lunox", "Esmeralda", "Lylia", "Odette",
                "Kagura", "Vexana", "Aurora", "Alice", "Cylops", "Eudora", "Nana", "Gord", "Yve", "Valentina", "Xavier"};
                String[] Suport = {"Estes", "Faramis", "Carmilla", "Kaja", "Lolita", "Angela", "Diggie", "Minotour", "Nana", "Rafaela", "Mathilda", "Floryn"};

                String[] LANE = {"Exp Lane", "Gold Lane", "Mid Lane", "Roamer", "Jungle"};
                int randomLANE = ThreadLocalRandom.current().nextInt(0, 4);
                int randomNum = ThreadLocalRandom.current().nextInt(0, 20 + 1);
                int randomFighter = ThreadLocalRandom.current().nextInt(0, 33);
                int randomSupot = ThreadLocalRandom.current().nextInt(0, 10);
                int randomMM = ThreadLocalRandom.current().nextInt(0, 21);
                int randomMage = ThreadLocalRandom.current().nextInt(0, 27);

                if (role.getSelectedItem().equals("Tank"))
                    output.setText("Kamu akan menggunakan " + Tank[randomNum]+ " sebagai " + LANE[randomLANE]);
                if (role.getSelectedItem().equals("Assassin"))
                    output.setText("Kamu akan menggunakan " + Asasin[randomNum]+ " sebagai " + LANE[randomLANE]);
                if (role.getSelectedItem().equals("Fighter"))
                    output.setText("Kamu akan menggunakan " + Fighter[randomNum]+ " sebagai " + LANE[randomLANE]);
                if (role.getSelectedItem().equals("Support"))
                    output.setText("Kamu akan menggunakan " + Suport[randomSupot]+ " sebagai " + LANE[randomLANE]);
                if (role.getSelectedItem().equals("Mage"))
                    output.setText("Kamu akan menggunakan " + Mage[randomNum]+ " sebagai " + LANE[randomLANE]);
                if (role.getSelectedItem().equals("Marksman"))
                    output.setText("Kamu akan menggunakan " + MM[randomMage]+ " sebagai " + LANE[randomLANE]);


                }



        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("main");
        frame.setContentPane(new main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
