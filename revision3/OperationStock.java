����   > ;  revision3/OperationStock  java/lang/Object  revision3/MouvementStock k I idOp art Lrevision3/Article; <clinit> ()V Code	     LineNumberTable LocalVariableTable <init> (Lrevision3/Article;)V
    	   	 	   
  this Lrevision3/OperationStock; toString ()Ljava/lang/String;   java/lang/StringBuilder " OperationStock [idOp=
  $  % (Ljava/lang/String;)V
  ' ( ) append (I)Ljava/lang/StringBuilder; + , art=
  - ( . -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  0 ( 1 -(Ljava/lang/Object;)Ljava/lang/StringBuilder; 3 ]
  5   getArt ()Lrevision3/Article; setArt 
SourceFile OperationStock.java!      
      	     
            %      � �                         ]     *� � `� *� � *+� �               	  
                  
          O     %� Y!� #*� � &*� ,*� � /2� ,� 4�                   %      6 7     /     *� �                         8      >     *+� �       
                      
    9    :