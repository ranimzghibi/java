����   > D  revision3/Article  java/lang/Object code I libelle Ljava/lang/String; qteStock stockMax <init> (ILjava/lang/String;II)V Code
     ()V	    	    	   	 	   
  LineNumberTable LocalVariableTable this Lrevision3/Article; getQteStock ()I setQteStock (I)V getStockMax toString ()Ljava/lang/String; % java/lang/StringBuilder ' Article [code=
 $ )  * (Ljava/lang/String;)V
 $ , - . append (I)Ljava/lang/StringBuilder; 0 
, libelle=
 $ 2 - 3 -(Ljava/lang/String;)Ljava/lang/StringBuilder; 5 , qteStock= 7 , stockMax= 9 ]
 $ ; " # getCode setCode equals (Lrevision3/Article;)Z a StackMapTable 
SourceFile Article.java !                 	     
            �     *� *� *,� *� *� �             	 	 
          4                        	      
          /     *� �                                >     *� �       
                      	    !      /     *� �                         " #     o     =� $Y&� (*� � +/� 1*� � 14� 1*� � +6� 1*� � +8� 1� :�            4  9         =      <      /     *� �                         =       >     *� �       
       !                     > ?     W     +� *� � +� *� � ��           #                @   A      B    C