package com.example.meusestudosandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {

    // Extender a classe para o SQLITEIOPENHELPER e gerar os contorutores

    // Passar a contante com o nome do nosso banco, podemos criar um nome para ele com o ponto bd
    public static final String DATABASE_NOME = "iguana.db";

    // VARIAVEL PARA ARMAZENAR O NOME DA TABELA
    public String TABLE_NAME = "NomeTelefone";

    // Variavel para armazenar o nome das colunas
    public static final String COLUNA_1= "id";
    public static final String COLUNA_2= "nome";
    public static final String COLUNA_3= "telefone";


    // Criar esse outra classe para inserirmos o nome do nosso banco
    public DatabaseHelper(Context context){
        super(context, DATABASE_NOME, null, 1);
    }

    // Criamos as tabelas do nosso banco
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Aqui criamos as tabelas do nosso banco
        // Passamos os create table para ele criar uma tabela com esse nome
        // passamos os dados que serao recebidos nessa tabela com o seu tipo de dado
        db.execSQL("create table " + TABLE_NAME + "(id integer primary key autoincrement, nome text, telefone text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    // Metodo de Inserir dados
    public void onInsert(String nome, String tel){
        // Escreve os dados na tabela
        SQLiteDatabase db = this.getWritableDatabase();

        // Variavel para conter varios valores
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUNA_2, nome);
        contentValues.put(COLUNA_3, tel);

        // Inserção de dados na tabela
        db.insert(TABLE_NAME, null, contentValues);
    }

    public Cursor showData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public void UpdateData(String id, String nome, String tel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUNA_1, id);
        contentValues.put(COLUNA_2, nome);
        contentValues.put(COLUNA_3, tel);
        db.update(TABLE_NAME, contentValues, "id=?", new String[]{id});

    }

    public void deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, "id=?", new String[]{id});

    }
}
