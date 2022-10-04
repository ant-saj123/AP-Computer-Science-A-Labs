import java.util.ArrayList;

/** RoadBuilder
 *  In this class you will implement the buildRoad method.
 *  This method will take a tile from tileStack and place it in the tiles matrix.
 *  The road will begin from location [0][0] and recursively expand from there.
 *
 *  You may assume each tile has at least 2 edges that contain a road.
 */
public class RoadBuilder {
    private Tile[][] tiles;
    private ArrayList<Tile> tileStack;

    public RoadBuilder(){
        tiles = new Tile[5][5];
        tileStack = getTileStack();
        buildRoad(0,0);


    }

    private boolean isValid(int r, int c){
        return r>=0 && r < tiles.length && c >= 0 && c < tiles[0].length;
    }

    /** buildRoad()
     *  This method will place the first tile in the list at location [r][c].
     *  After placing the tile, determine which neighboring tile will take the next tile in the list.
     *  You should follow this order when checking neighbors - Up, Right, Down, Left.
     *
     *  For example, if tiles[r][c] top edge is 'R' and the above neighbor [r-1][c] isValid, rotate the next tile in the list
     *  until the that tiles down edge is 'R'. When the next tile edge matches, make a recursive call.
     *
     *  When the current tile only has invalid or already visited neighbors, no further recursive calls are made.
     *
     *  This problem can be solved through other approaches but following these guidelines will more closely match the example.
     */
    public void buildRoad(int r , int c ){


tiles[r][c] = tileStack.remove(0);

if(!tileStack.isEmpty()){
    if(isValid(r-1,c) && tiles[r-1][c] == null && tiles[r][c].getUpEdge() == 'R'){
    for(int i = 0; i< 4;i++) {
        if (tileStack.get(0).getDownEdge() == 'R') {
            buildRoad(r - 1, c);
            i = 4;
        } else {
            tileStack.get(0).rotateTile();
        }
    }

    }

    if(isValid(r,c+1) && tiles[r][c+1] == null && tiles[r][c].getRightEdge() == 'R'){
        for(int i = 0; i< 4;i++) {
            if (tileStack.get(0).getLeftEdge() == 'R') {
                buildRoad(r, c + 1);
                i = 4;
            } else {
                tileStack.get(0).rotateTile();
            }
        }
        }

    if(isValid(r+1,c) && tiles[r+1][c] == null && tiles[r][c].getDownEdge() == 'R'){
        for(int i = 0; i< 4;i++) {
            if (tileStack.get(0).getUpEdge() == 'R') {
                buildRoad(r + 1, c);
                i = 4;
            } else {
                tileStack.get(0).rotateTile();
            }
        }

        }

    if(isValid(r,c-1) && tiles[r][c-1] == null && tiles[r][c].getLeftEdge() == 'R')
    {
        for(int i = 0; i< 4;i++) {
            if (tileStack.get(0).getRightEdge() == 'R') {
                buildRoad(r, c - 1);
                i = 4;
            } else {
                tileStack.get(0).rotateTile();
            }
        }

        }
}



        }






    public ArrayList getTileStack(){
        ArrayList tileStack = new ArrayList<>();
        tileStack.add(new Tile(new char[]{'F', 'R', 'R','F'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'F','R'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'F','R'}));
        tileStack.add(new Tile(new char[]{'R', 'R', 'F','F'}));
        tileStack.add(new Tile(new char[]{'F', 'F', 'R','R'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'F','R'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'R', 'R','F'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'R','F'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'R', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'R', 'F','F'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'F','R'}));
        tileStack.add(new Tile(new char[]{'F', 'R', 'F','R'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'F','R'}));
        tileStack.add(new Tile(new char[]{'F', 'F', 'R','R'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'F','R'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'F','R'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'F','R'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'R','F'}));
        tileStack.add(new Tile(new char[]{'R', 'F', 'R','F'}));


        return tileStack;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

}
