????   4 G  ConversaoMetros  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LConversaoMetros; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   digite os metros
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D@?@      . java/lang/StringBuilder 0 2o valor em metros convertido para quilômetros é 
 - 2  &
 - 4 5 6 append (D)Ljava/lang/StringBuilder;
 - 8 9 : toString ()Ljava/lang/String;
  < =  close args [Ljava/lang/String; leia Ljava/util/Scanner; m D km 
SourceFile ConversaoMetros.java !               /     *? ?    
                    	       ?     ;? Y? ? L? ? !+? 'I( +o9? ? -Y/? 1? 3? 7? !+? ;?    
           	     6  :     *    ; > ?    0 @ A   # B C    D C   E    F