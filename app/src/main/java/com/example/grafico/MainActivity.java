package com.example.grafico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiPropiaVista(this));
    }

    public class MiPropiaVista extends View {
        public MiPropiaVista(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            //este arreglo recibe los kilometros recorridos, en este caso de 6 dias
            ArrayList<Integer> kilo=new ArrayList<Integer>();
            //Ahora al no estar integrado al api de GoogleMaps le pondre los valores del ejemplo
            kilo.add(3);
            kilo.add(4);
            kilo.add(1);
            kilo.add(2);
            kilo.add(0);
            kilo.add(2);
            kilo.add(3);
            Paint miPincel=new Paint();
            Paint miPincel2=new Paint();
            Paint miPincel3=new Paint();
            Paint miPincel4=new Paint();
            Paint miPincel5=new Paint();
            miPincel.setColor(Color.BLUE);
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.FILL);
            miPincel2.setColor(Color.RED);
            miPincel2.setStrokeWidth(1);
            miPincel2.setStyle(Paint.Style.FILL);
            miPincel2.setTextSize(60);
            miPincel3.setColor(Color.GRAY);
            miPincel3.setStrokeWidth(8);
            miPincel3.setStyle(Paint.Style.FILL);
            miPincel4.setColor(Color.BLACK);
            miPincel4.setStrokeWidth(1);
            miPincel4.setStyle(Paint.Style.FILL);
            miPincel4.setTextSize(30);
            miPincel5.setColor(Color.BLACK);
            miPincel5.setStrokeWidth(1);
            miPincel5.setStyle(Paint.Style.FILL);
            miPincel5.setTextSize(50);
            canvas.drawText("Progreso",450,100,miPincel2);
            canvas.drawLine(100,600-(kilo.get(0)*100-50),250,600-(kilo.get(1)*100-50),miPincel);
            canvas.drawText(kilo.get(0)+"",100,600-(kilo.get(0)*100-40),miPincel5);
            canvas.drawLine(250,600-(kilo.get(1)*100-50),400,600-(kilo.get(2)*100-50),miPincel);
            canvas.drawText(kilo.get(1)+"",250,600-(kilo.get(1)*100-40),miPincel5);
            canvas.drawLine(400,600-(kilo.get(2)*100-50),550,600-(kilo.get(3)*100-50),miPincel);
            canvas.drawText(kilo.get(2)+"",400,600-(kilo.get(2)*100-40),miPincel5);
            canvas.drawLine(550,600-(kilo.get(3)*100-50),700,600-(kilo.get(4)*100-50),miPincel);
            canvas.drawText(kilo.get(3)+"",550,600-(kilo.get(3)*100-40),miPincel5);
            canvas.drawLine(700,600-(kilo.get(4)*100-50),850,600-(kilo.get(5)*100-50),miPincel);
            canvas.drawText(kilo.get(4)+"",700,600-(kilo.get(4)*100-40),miPincel5);
            canvas.drawLine(850,600-(kilo.get(5)*100-50),1000,600-(kilo.get(6)*100-50),miPincel);
            canvas.drawText(kilo.get(5)+"",850,600-(kilo.get(5)*100-40),miPincel5);
            for(int i=1;i<=11;i++){
                canvas.drawLine(0+100,i*50+100,700+300,i*50+100,miPincel3);
            }
            for(int i=0;i<6;i++){
                canvas.drawText("Dia "+(i+1),100+150*i,750,miPincel4);
            }

        }
    }
}