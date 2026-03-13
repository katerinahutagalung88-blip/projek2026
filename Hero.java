public class Hero {
    public class Hero {
    String name;
    int level;
    int hp;

    
    
    public void attack() {
       
        System.out.println(this.name + " menyerang musuh dengan brutal! ⚔️");
    }

    
    public void showProfile() {
        
        System.out.println("Level     : " + this.level);
        System.out.println("Sisa HP   : " + this.hp);
        System.out.println("===========================");
    }
}
    
}
