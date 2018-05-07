public class ServerNameGenerator {
    public static void main(String[] args){
        String[] adjectives = new String[10];
        adjectives[0] = "super";
        adjectives[1] = "awesome";
        adjectives[2] = "spooky";
        adjectives[3] = "ambitious";
        adjectives[4] = "venomous";
        adjectives[5] = "divine";
        adjectives[6] = "nebulous";
        adjectives[7] = "mythic";
        adjectives[8] = "arcane";
        adjectives[9] = "sneaky";
        String[] nouns = new String[10];
        nouns[0] = "ghost";
        nouns[1] = "phantom";
        nouns[2] = "kitten";
        nouns[3] = "eggplant";
        nouns[4] = "chicken";
        nouns[5] = "unicorn";
        nouns[6] = "boombox";
        nouns[7] = "aardvark";
        nouns[8] = "badger";
        nouns[9] = "rogue";
        String[] verbs = new String[10];
        verbs[0] = "faceplants";
        verbs[1] = "attacks";
        verbs[2] = "dances";
        verbs[3] = "gets down";
        verbs[4] = "moonwalks";
        verbs[5] = "hits the fadeaway";
        verbs[6] = "throws down the hammer";
        verbs[7] = "has no regard for human life";
        verbs[8] = "meows loudly";
        verbs[9] = "zaps you with a ray gun";
        for(int i = 0; i < 10; i++){
            long random = Math.round(Math.random() * 9);
            int x = (int) random;
            long randomTwo = Math.round(Math.random() * 9);
            int y = (int) randomTwo;
            long randomThree = Math.round(Math.random() * 9);
            int z = (int) randomThree;
            System.out.println(adjectives[x] + "-" + nouns[y] + " " + verbs[z]);

        }
    }
}
