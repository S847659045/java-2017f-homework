public class Arrow extends Queue {
    Arrow(Battle battle)
    {
        num=7;
        positions=new Position[7];
        positions[0]=battle.getPosition(8,5);
        positions[1]=battle.getPosition(7,6);
        positions[2]=battle.getPosition(6,7);
        positions[3]=battle.getPosition(5,8);
        positions[4]=battle.getPosition(4,9);
        positions[5]=battle.getPosition(3,10);
        positions[6]=battle.getPosition(2,11);
    }
}
