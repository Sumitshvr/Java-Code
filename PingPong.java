import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// this class is used to implement all the logic for the game
class Game extends JPanel implements ActionListener
{
    boolean leftup; //used to check if the left paddle is moving up
    boolean leftdown; //used to check if the left paddle is moving down
    boolean rightup;   //used to check if the right paddle is moving up
    boolean rightdown; //used to check if the right paddle is moving down

    int leftx,lefty,rightx,righty; // these variables are used to store the x and y coordinates of the paddles

    Timer time; //used to create a timer object
    int delay=100; //used to store the delay for the timer

    boolean inGame; //used to check if the game is in progress

    boolean ballleft; //used to check if the ball is moving left
    boolean ballright; //used to check if the ball is moving right
    boolean ballup; //used to check if the ball is moving up
    boolean balldown; //used to check if the ball is moving down

    int ballx,bally; //these variables are used to store the x and y coordinates of the ball

    int flag=0; //used to check if the ball has hit the paddle
    int win=0; //used to check if the game has been won
    Game(int x,int y,int width,int height)
    {

        setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.green));

        addKeyListener(new KeyMover());
        setBackground(Color.black); //sets the background color of the board
        setFocusable(true);
        setVisible(true);
        setBounds(x,y,width,height);    //sets the bounds of the board

        initGame();
    }

    // this method is used to initialize the game
    public void initGame()
    {
        leftdown=false;
        leftup=false;
        rightdown=false;
        rightup=false;

        leftx=20;
        lefty=300;

        rightx=1070;
        righty=300;

        inGame=true;

        delay=50;

        ballleft=false;
        ballright=true;
        ballup=true;
        balldown=false;

        win=0;

        ballx=50;
        bally=150;

        time=new Timer(delay, this);
        time.start();

    }

    // this method is used to paint the components on the board
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        doPaint(g);

    }

    // this method is used to move the paddles and ball
    public void move()
    {
        if(leftup) //if the left paddle is moving up
        {
            if(lefty==0)
            {
                lefty=0; //if the left paddle is at the top of the board, do not move it
            }
            else
            {
                lefty-=20; //move the left paddle up by 20 pixels
            }
        }
        if(leftdown) //if the left paddle is moving down
        {
            if(lefty==600)
            {
                lefty=600; //if the left paddle is at the bottom of the board, do not move it
            }
            else
            {
                lefty+=20; //move the left paddle down by 20 pixels
            }
        }
        if(rightup) //if the right paddle is moving up
        {
            if(righty==0)
            {
                righty=0; //if the right paddle is at the top of the board, do not move it
            }
            else
            {
                righty-=20; //move the right paddle up by 20 pixels
            }
        }
        if(rightdown) //if the right paddle is moving down
        {
            if(righty==600)
            {
                righty=600; //if the right paddle is at the bottom of the board, do not move it
            }
            else
            {
                righty+=20; //move the right paddle down by 20 pixels
            }
        }

        if(ballright && ballup) // if the ball is moving right and up
        {
            if(bally==0)
            {  //if the ball is at the top of the board, make it move down
                ballup=false;
                balldown=true;
                ballx+=10;
                bally+=10;
            }
            else
            { // if the ball is not at the border of the board, move it diagonally

                ballx+=10;
                bally-=10;
            }
            return;
        }
        if(ballright && balldown)
        { // if the ball is moving right and down
            if(bally==600)
            { //if the ball is at the bottom of the board, make it move up
                ballup=true;
                balldown=false;
                ballx+=10;
                bally-=10;
            }
            else
            { // if the ball is not at the border of the board, move it diagonally
                ballx+=10;
                bally+=10;
            }
            return;
        }
        if(ballleft && ballup)
        { // if the ball is moving left and up
            if(bally==0)
            { //if the ball is at the top of the board, make it move down
                ballup=false;
                balldown=true;
                ballx-=10;
                bally+=10;
            }
            else
            { // if the ball is not at the border of the board, move it diagonally
                ballx-=10;
                bally-=10;
            }
            return;
        }
        if(ballleft && balldown)
        {
            if(bally==600)
            { //if the ball is at the bottom of the board, make it move up
                ballup=true;
                balldown=false;
                ballx-=10;
                bally-=10;
            }
            else
            { // if the ball is not at the border of the board, move it diagonally
                ballx-=10;
                bally+=10;
            }
            return;
        }

    }

    // this method is used to check the winner
    public void checkWins()
    {
        if(ballx<=0)
        { //if the ball is at the left border of the board, the right player wins
            inGame=false;
            win=1;
        }
        if(ballx>=1100)
        { //if the ball is at the right border of the board, the left player wins
            inGame=false;
            win=0;
        }
        if(ballx==rightx)
        { //if the ball is at the right paddle, make it move left
            if(bally>=righty && bally<=(righty+100))
            { //if the ball is at the right paddle, make it move left
                ballright=false;
                ballleft=true;
            }

        }
        if(ballx==leftx)
        { //if the ball is at the left paddle, make it move right
            if(bally>=lefty && bally<=(lefty+100))
            { //if the ball is at the left paddle, make it move right
                ballright=true;
                ballleft=false;
            }
        }
    }

    // this method is used to paint the components on the board
    public void doPaint(Graphics g)
    {
        if(inGame)
        { //if the game is in progress, paint the board
           /* g.setColor(Color.white);
            g.setFont(new Font("MV Boli", Font.BOLD, 30));
            g.drawString("Use P and L", 850,50);

            g.setColor(Color.white);
            g.setFont(new Font("MV Boli", Font.BOLD, 30));
            g.drawString("Use Q and A", 50,50);*/

            g.setColor(Color.DARK_GRAY);
            g.drawLine(550, 0, 550, 600);

            g.setColor(Color.white);
            g.fillOval(ballx, bally, 10, 10);

            g.setColor(Color.green);
            g.fillRect(leftx, lefty, 10, 100);

            g.setColor(Color.red);
            g.fillRect(rightx, righty, 10, 100);

        }
        else
        { //if the game is not in progress, paint the winner
            gameOver(g);
        }
        Toolkit.getDefaultToolkit().sync();
    }

    public void gameOver(Graphics g)
    {
        String msg = "Game Over";
        Font small = new Font("MV Boli", Font.BOLD, 35);
        FontMetrics metr = getFontMetrics(small);

        int width=this.getWidth();
        int height=this.getHeight();

        g.setColor(Color.white);
        g.setFont(small);

        g.drawString(msg, (width - metr.stringWidth(msg)) / 2, height/2 - 50);
        g.setColor(Color.ORANGE);
        if(win==0)
        {
            g.drawString("Left Player Wins!", (width - metr.stringWidth(msg))/2 - 60, height/2  + 10);
        }
        else
        {
            g.drawString("Right Player Wins!", (width - metr.stringWidth(msg))/2 - 60, height/2  + 10);
        }

        g.setColor(Color.orange);
        g.setFont(new Font("MV Boli", Font.BOLD, 40));
        g.drawString("Press Enter to Restart", (width - metr.stringWidth(msg))/2 - 120, height/2  + 50);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {

        if (inGame)
        {
            checkWins();
            move();
        }

        repaint();

    }

    // this method is used to move the paddles
    public class KeyMover extends KeyAdapter
    {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode(); // get the key pressed

            if ((key == KeyEvent.VK_Q) ) { // if the key pressed is Q, move the left paddle up
                leftup=true;
                leftdown=false;
            }

            if ((key == KeyEvent.VK_A) ) { // if the key pressed is A, move the left paddle down
                leftup=false;
                leftdown=true;
            }

            if ((key == KeyEvent.VK_UP) ) { // if the key pressed is P, move the right paddle up
                rightup=true;
                rightdown=false;
            }

            if ((key == KeyEvent.VK_DOWN)) { // if the key pressed is L, move the right paddle down
                rightup=false;
                rightdown=true;
            }

            if((key == KeyEvent.VK_ENTER)){ // if the key pressed is Enter, restart the game
                if(!inGame){
                    initGame();
                }
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_Q) ) {
                leftup=false;
            }

            if ((key == KeyEvent.VK_A) ) {
                leftdown=false;
            }

            if ((key == KeyEvent.VK_UP) ) {
                rightup=false;
            }

            if ((key == KeyEvent.VK_DOWN)) {
                rightdown=false;
            }

        }

    }
}

// this class is used to create the frame of the game
class Frame extends JFrame implements ActionListener,MouseListener
{
    Container cont;
    int height,width,x,y;
    Game b1;
    String lab;
    Frame(int x,int y,int width,int height)
    {
        cont = getContentPane();
        cont.setLayout(null);
        setLayout(null);

        this.height=height;
        this.width=width;
        this.x=x;
        this.y=y;

        setBounds(x,y,width,height);
        setVisible(true);
        setLayout(null);

        b1=new Game(0,0,width,height);
        cont.add(b1);


        setLocationRelativeTo(null);
        setResizable(false);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae)
    {
        lab=ae.getActionCommand();
    }

    // these methods are not used but required to implement MouseListener
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}

class Pong {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame e1 = new Frame(0,0,1100,600);
                e1.setBounds(200,150,1100,638);
                e1.setVisible(true);
            }
        });
    }

}