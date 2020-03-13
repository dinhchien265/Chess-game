package com.example.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.chess.game.GameController;
import com.example.chess.game.Position;

public  class MainActivity extends AppCompatActivity {
    Button[][] bt;
    Button newgame;
    public static ImageView rook;
    GameController gameController;
    int kt;
//    final Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.anim1);
//    final Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.anim2);
//    final Animation anim3 = AnimationUtils.loadAnimation(this,R.anim.anim3);
//    final Animation anim4 = AnimationUtils.loadAnimation(this,R.anim.anim4);
//    final Animation anim5 = AnimationUtils.loadAnimation(this,R.anim.anim5);
//    final Animation anim6 = AnimationUtils.loadAnimation(this,R.anim.anim6);
//    final Animation anim7 = AnimationUtils.loadAnimation(this,R.anim.anim7);
//    final Animation anim8 = AnimationUtils.loadAnimation(this,R.anim.anim8);
//
//    final Animation knight1 = AnimationUtils.loadAnimation(this,R.anim.knight1);
//    final Animation knight2 = AnimationUtils.loadAnimation(this,R.anim.knight2);
//    final Animation knight3 = AnimationUtils.loadAnimation(this,R.anim.knight3);
//    final Animation knight4 = AnimationUtils.loadAnimation(this,R.anim.knight4);
//    final Animation knight5 = AnimationUtils.loadAnimation(this,R.anim.knight5);
//    final Animation knight6 = AnimationUtils.loadAnimation(this,R.anim.knight6);
//    final Animation knight7 = AnimationUtils.loadAnimation(this,R.anim.knight7);
//    final Animation knight8 = AnimationUtils.loadAnimation(this,R.anim.knight8);

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=new Button[8][8];
        gameController=new GameController();
        newgame=findViewById(R.id.newgame);
        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });

        anhXa();
        setActionListioner();

//        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
//        bt[0][0].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"chien dep trai"+rook.getWidth(),Toast.LENGTH_LONG).show();
//                System.out.println(rook.getWidth());
//                rook.setTranslationX(134);
//                rook.setTranslationY(134);
//            }
//        });

    }
    private void anhXa(){
        rook=findViewById(R.id.black_rook1);

        gameController.chessBoard.board.tiles[0][0].getPiece().view=findViewById(R.id.black_rook1);
        gameController.chessBoard.board.tiles[1][0].getPiece().view=findViewById(R.id.black_knight1);
        gameController.chessBoard.board.tiles[2][0].getPiece().view=findViewById(R.id.black_bishop1);
        gameController.chessBoard.board.tiles[3][0].getPiece().view=findViewById(R.id.black_queen);
        gameController.chessBoard.board.tiles[4][0].getPiece().view=findViewById(R.id.black_king);
        gameController.chessBoard.board.tiles[5][0].getPiece().view=findViewById(R.id.black_bishop2);
        gameController.chessBoard.board.tiles[6][0].getPiece().view=findViewById(R.id.black_knight2);
        gameController.chessBoard.board.tiles[7][0].getPiece().view=findViewById(R.id.black_rook2);
        gameController.chessBoard.board.tiles[0][1].getPiece().view=findViewById(R.id.black_pawn1);
        gameController.chessBoard.board.tiles[1][1].getPiece().view=findViewById(R.id.black_pawn2);
        gameController.chessBoard.board.tiles[2][1].getPiece().view=findViewById(R.id.black_pawn3);
        gameController.chessBoard.board.tiles[3][1].getPiece().view=findViewById(R.id.black_pawn4);
        gameController.chessBoard.board.tiles[4][1].getPiece().view=findViewById(R.id.black_pawn5);
        gameController.chessBoard.board.tiles[5][1].getPiece().view=findViewById(R.id.black_pawn6);
        gameController.chessBoard.board.tiles[6][1].getPiece().view=findViewById(R.id.black_pawn7);
        gameController.chessBoard.board.tiles[7][1].getPiece().view=findViewById(R.id.black_pawn8);


        gameController.chessBoard.board.tiles[0][7].getPiece().view=findViewById(R.id.white_rook1);
        gameController.chessBoard.board.tiles[1][7].getPiece().view=findViewById(R.id.white_knight1);
        gameController.chessBoard.board.tiles[2][7].getPiece().view=findViewById(R.id.white_bishop1);
        gameController.chessBoard.board.tiles[3][7].getPiece().view=findViewById(R.id.white_queen);
        gameController.chessBoard.board.tiles[4][7].getPiece().view=findViewById(R.id.white_king);
        gameController.chessBoard.board.tiles[5][7].getPiece().view=findViewById(R.id.white_bishop2);
        gameController.chessBoard.board.tiles[6][7].getPiece().view=findViewById(R.id.white_knight2);
        gameController.chessBoard.board.tiles[7][7].getPiece().view=findViewById(R.id.white_rook2);

        gameController.chessBoard.board.tiles[0][6].getPiece().view=findViewById(R.id.white_pawn1);
        gameController.chessBoard.board.tiles[1][6].getPiece().view=findViewById(R.id.white_pawn2);
        gameController.chessBoard.board.tiles[2][6].getPiece().view=findViewById(R.id.white_pawn3);
        gameController.chessBoard.board.tiles[3][6].getPiece().view=findViewById(R.id.white_pawn4);
        gameController.chessBoard.board.tiles[4][6].getPiece().view=findViewById(R.id.white_pawn5);
        gameController.chessBoard.board.tiles[5][6].getPiece().view=findViewById(R.id.white_pawn6);
        gameController.chessBoard.board.tiles[6][6].getPiece().view=findViewById(R.id.white_pawn7);
        gameController.chessBoard.board.tiles[7][6].getPiece().view=findViewById(R.id.white_pawn8);



        bt[0][0]= findViewById(R.id.t00);
        bt[0][1]= findViewById(R.id.t01);
        bt[0][2]= findViewById(R.id.t02);
        bt[0][3]= findViewById(R.id.t03);
        bt[0][4]= findViewById(R.id.t04);
        bt[0][5]= findViewById(R.id.t05);
        bt[0][6]= findViewById(R.id.t06);
        bt[0][7]= findViewById(R.id.t07);
        bt[1][0]= findViewById(R.id.t10);
        bt[1][1]= findViewById(R.id.t11);
        bt[1][2]= findViewById(R.id.t12);
        bt[1][3]= findViewById(R.id.t13);
        bt[1][4]= findViewById(R.id.t14);
        bt[1][5]= findViewById(R.id.t15);
        bt[1][6]= findViewById(R.id.t16);
        bt[1][7]= findViewById(R.id.t17);
        bt[2][0]= findViewById(R.id.t20);
        bt[2][1]= findViewById(R.id.t21);
        bt[2][2]= findViewById(R.id.t22);
        bt[2][3]= findViewById(R.id.t23);
        bt[2][4]= findViewById(R.id.t24);
        bt[2][5]= findViewById(R.id.t25);
        bt[2][6]= findViewById(R.id.t26);
        bt[2][7]= findViewById(R.id.t27);
        bt[3][0]= findViewById(R.id.t30);
        bt[3][1]= findViewById(R.id.t31);
        bt[3][2]= findViewById(R.id.t32);
        bt[3][3]= findViewById(R.id.t33);
        bt[3][4]= findViewById(R.id.t34);
        bt[3][5]= findViewById(R.id.t35);
        bt[3][6]= findViewById(R.id.t36);
        bt[3][7]= findViewById(R.id.t37);
        bt[4][0]= findViewById(R.id.t40);
        bt[4][1]= findViewById(R.id.t41);
        bt[4][2]= findViewById(R.id.t42);
        bt[4][3]= findViewById(R.id.t43);
        bt[4][4]= findViewById(R.id.t44);
        bt[4][5]= findViewById(R.id.t45);
        bt[4][6]= findViewById(R.id.t46);
        bt[4][7]= findViewById(R.id.t47);
        bt[5][0]= findViewById(R.id.t50);
        bt[5][1]= findViewById(R.id.t51);
        bt[5][2]= findViewById(R.id.t52);
        bt[5][3]= findViewById(R.id.t53);
        bt[5][4]= findViewById(R.id.t54);
        bt[5][5]= findViewById(R.id.t55);
        bt[5][6]= findViewById(R.id.t56);
        bt[5][7]= findViewById(R.id.t57);
        bt[6][0]= findViewById(R.id.t60);
        bt[6][1]= findViewById(R.id.t61);
        bt[6][2]= findViewById(R.id.t62);
        bt[6][3]= findViewById(R.id.t63);
        bt[6][4]= findViewById(R.id.t64);
        bt[6][5]= findViewById(R.id.t65);
        bt[6][6]= findViewById(R.id.t66);
        bt[6][7]= findViewById(R.id.t67);
        bt[7][0]= findViewById(R.id.t70);
        bt[7][1]= findViewById(R.id.t71);
        bt[7][2]= findViewById(R.id.t72);
        bt[7][3]= findViewById(R.id.t73);
        bt[7][4]= findViewById(R.id.t74);
        bt[7][5]= findViewById(R.id.t75);
        bt[7][6]= findViewById(R.id.t76);
        bt[7][7]= findViewById(R.id.t77);
    }
    private void setActionListioner(){
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                final int finalJ = j;
                final int finalI = i;
                bt[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gameController.click(new Position(finalI, finalJ));
                        Toast.makeText(MainActivity.this,"r"+rook.getWidth(),Toast.LENGTH_LONG).show();

                    }
                });
            }
        }
    }

}
