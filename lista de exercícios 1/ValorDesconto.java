����   4 O  ValorDesconto  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LValorDesconto; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite o preço do produto: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D , # Digite a porcentagem de desconto: @Y       0 java/lang/StringBuilder 2 #O valor com desconto a vista é de:
 / 4  &
 / 6 7 8 append (D)Ljava/lang/StringBuilder; :  reais
 / < 7 = -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 / ? @ A toString ()Ljava/lang/String;
  C D  close args [Ljava/lang/String; leia Ljava/util/Scanner; v D p valord 
SourceFile ValorDesconto.java !               /     *� �    
                    	       �     W� Y� � L� � !+� 'I� +� !+� '9(k -o9(g9� � /Y1� 3� 59� ;� >� !+� B�    
   * 
       	      &  0  6  R  V     4    W E F    L G H   ? I J  & 1 K J  6 ! L J   M    N