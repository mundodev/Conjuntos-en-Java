/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmos;

/**
 *
 * @author SERINAC VG
 */
public class ClaseConjunto {
    
    private String [] _Ca,_Cb,_Cr;
    private int _LongA,_LongB;

    
    //Constructor    
    public void ConjuntoCa(int LongA)
    {
        _LongA=LongA;
        _Ca= new String [_LongA];
    }
    
    public void ConjuntoCb(int LongB)
    {
        _LongB=LongB;
        _Cb= new String [_LongB];
    }
    
    //Metodos Set
    
    public void Ca(String Ca,int Indice)
    {
        _Ca[Indice]=Ca;
    }
    
    public void Ca(String []Ca)
    {
        _Ca=Ca;
    }
    
    public void Cb(String Cb,int Indice)
    {
        _Cb[Indice]=Cb;
    }
    
    public void Cb(String []Cb)
    {
        _Cb=Cb;
    }
    
    //Metodos Get
    
    public int LongA()
    {
        return _LongA;
    }
    
    public int LongB()
    {
        return _LongB;
    }
    
    public String Ca(int Indice)
    {
        return _Ca[Indice];
    }
    
    public String [] Ca()
    {
        return _Ca;
    }
    
    public String Cb(int Indice)
    {
        return _Cb[Indice];
    }
    
    public String [] Cb()
    {
        return _Cb;
    }
   
    //OPERACIONES DE CONJUNTOS
   
    //Union
    
    public String Union()
    {
        int _Contador=0;
        int _Bandera=0;
        String _Cadena=""; //Salida de Pantalla
        //Lleno con el Conjunto A
        _Cr=new String [_LongA+_LongB]; //Llena de Nullos Conjunto Resultante
        for (int i=0;i<_LongA;i++)
        {
           _Cr[i]=_Ca[i];
        }
        //Almaceno posicion del Conjunto Resultante
        _Contador=_LongA;
        //Comparo las Repeticiones
        for (int i=0;i<_LongB;i++)
        {            
            _Bandera=0;
            for (int j=0;j<_LongA+_LongB;j++)
            {
                if (_Cb[i].equals(_Cr[j]))
                {
                    _Bandera=1;  
                }
            }
            if (_Bandera==0){
            _Cr[_Contador]=_Cb[i];
            _Contador++;
            }
        }
        //Llena String para Salida en Pantalla
        for (int i=0;i<_LongA+_LongB;i++)
           if (_Cr[i]!=null)
           _Cadena=_Cadena+_Cr[i]+";";
           return _Cadena;
    }
   
    //Interceccion
    
    public String Interseccion(){
        int _Contador=0;
        int _Bandera=0;
        String _Cadena=""; //Salida de Pantalla
        _Cr=new String [_LongA+_LongB];//Llena de Nullos Conjunto Resultante
        for (int i=0;i<_LongA;i++){
            _Bandera=0;
            for (int j=0;j<_LongB;j++){
                if (_Ca[i].equals(_Cb[j]))           
                  _Bandera=1;  
            }
            if (_Bandera==1){
            _Cr[_Contador]=_Ca[i];
            _Contador++;
            }
        }
        //Llena String para Salida en Pantalla
        for (int i=0;i<_LongA+_LongB;i++)
            if (_Cr[i]!=null)
                _Cadena=_Cadena+_Cr[i]+";";
        return _Cadena; 
    }
   
    //Diferencia
    
    public String Diferencia(){
        int _Contador=0;
        int _Bandera=0;
        String _Cadena=""; //Salida de Pantalla
        _Cr=new String [_LongA+_LongB];//Llena de Nullos Conjunto Resultante
        //Los no Repetidos de A
        for (int i=0;i<_LongA;i++){
            _Bandera=0;
            for (int j=0;j<_LongB;j++){
                if (_Ca[i].equals(_Cb[j]))           
                  _Bandera=1;  
            }
            if (_Bandera==0){
            _Cr[_Contador]=_Ca[i];
            _Contador++;
            }
        }
       
        //Llena String para Salida en Pantalla
        for (int i=0;i<_LongA+_LongB;i++)
            if (_Cr[i]!=null)
            _Cadena=_Cadena+_Cr[i]+";";
        return _Cadena; 
    }
    
    //Diferencia Simétrica

    public String DiferenciaSimetrica(){
        int _Contador=0;
        int _Bandera=0;
        String _Cadena=""; //Salida de Pantalla
        _Cr=new String [_LongA+_LongB];//Llena de Nullos Conjunto Resultante
        //Los no Repetidos de A
        for (int i=0;i<_LongA;i++){
            _Bandera=0;
            for (int j=0;j<_LongB;j++){
                if (_Ca[i].equals(_Cb[j]))           
                  _Bandera=1;  
            }
            if (_Bandera==0){
            _Cr[_Contador]=_Ca[i];
            _Contador++;
            }
        }
        //Los no Repetidos de B
        for (int i=0;i<_LongB;i++){
            _Bandera=0;
            for (int j=0;j<_LongA;j++){
                if (_Cb[i].equals(_Ca[j]))           
                  _Bandera=1;  
            }
            if (_Bandera==0){
            _Cr[_Contador]=_Cb[i];
            _Contador++;
            }
        }
        //Llena String para Salida en Pantalla
        for (int i=0;i<_LongA+_LongB;i++)
            if (_Cr[i]!=null)
            _Cadena=_Cadena+_Cr[i]+";";
        return _Cadena; 
    }
}
