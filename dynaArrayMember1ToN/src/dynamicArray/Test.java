package dynamicArray;

import java.util.ArrayList;


    public class Test
    {
        public static void main(String[] args)
        {

            PickUp weapon = new PickUp("weapon");
            PickUp health = new PickUp("health");
            PickUp bomb = new PickUp("bomb");
            PickUp[] pp = {weapon,health,bomb };
            ArrayList<Player> players = new ArrayList<Player>();         
            for (int i = 0; i < 16; i++) //players
            {
                Player p = new Player();
                for (int j = 0; j < 2; j++) // items 
                    if (Math.floor(Math.random()*2) == 0)
                        p.pickups.add(pp[j]);
                players.add(p); 
            }
            // print the number of players
            // who have picked up a bomb 
            int count=0;
            for (Player p: players){
                System.out.println(p.pickups.get(0).name);
                if (p.pickups.get(0) == bomb)
                    count++;
             }
            System.out.println(count);
        }
    }
