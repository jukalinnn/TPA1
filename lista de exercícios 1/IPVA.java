����   4 N  IPVA  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LIPVA; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite o valor do carro:
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D@      @Y       0 java/lang/StringBuilder 2 O valor do IPVA é de: 
 / 4  &
 / 6 7 8 append (D)Ljava/lang/StringBuilder; : reais
 / < 7 = -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 / ? @ A toString ()Ljava/lang/String;
  C D  close args [Ljava/lang/String; leia Ljava/util/Scanner; v D ipva 
SourceFile 	IPVA.java !               /     *� �    
                    	       �     D� Y� � L� � !+� 'I( +k -o9� � /Y1� 3� 59� ;� >� !+� B�    
           	   #  ?  C     *    D E F    9 G H   , I J  # ! K J   L    M