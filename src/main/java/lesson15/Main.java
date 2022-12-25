package lesson15;


import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class Main {

  static void httpConnection() {
    try {
      // Класс URL - создание адреса, к которому обращаемся
      URL wikiUrl = new URL("https://ru.wikipedia.org/wiki/HTTP");
      // Создаем подключение по адресу, учитывая, что работаем с HTTP протоколом
      HttpURLConnection connection = (HttpURLConnection) wikiUrl.openConnection();
//      System.out.println(connection);
      // Задаем метод HTTP запроса
      connection.setRequestMethod("GET");
      // Задание заголовков
      // code
      // Делаем запрос и считываем код ответа
      int responseCode = connection.getResponseCode();
//      System.out.println(responseCode);
      if (responseCode == 200) {
        // В случае успешного запроса получаем поток ввода ответа и считываем из него данные
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer response = new StringBuffer();
        String inputLine = in.readLine();
        int lineCount = 0;
        while (inputLine != null) {
          lineCount++;
          response.append(inputLine);
          response.append("\n");
          inputLine = in.readLine();
        }
        in.close();

        System.out.println(response);
        System.out.println("there was " + lineCount + " lines");
      } else {
        System.out.println(responseCode);
      }
    } catch (MalformedURLException e) {
      System.out.println("Bad url:" + e.getMessage());
    } catch (IOException e) {
      System.out.println("IOException: " + e.getMessage());
    }
  }

  // Сделать HTTP get запрос
  // на адрес https://dog.ceo/api/breeds/image/random
  // Из ответа считать строчку и вывести ее на экран
  static void task1() {
    try {
      URL dogPicUrl = new URL("https://dog.ceo/api/breeds/image/random");
      HttpURLConnection connection = (HttpURLConnection) dogPicUrl.openConnection();
      connection.setRequestMethod("GET");

      int responseCode = connection.getResponseCode();
      if (responseCode == 200) {
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = in.readLine();
        System.out.println(response);
        in.close();
      } else {
        System.out.println("Bad code: " + responseCode);
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  static void downloadDogPicture() {
    try {
      URL dogPicInfo = new URL("https://dog.ceo/api/breeds/image/random");
      HttpURLConnection connection = (HttpURLConnection) dogPicInfo.openConnection();
      connection.setRequestMethod("GET");

      int responseCode = connection.getResponseCode();
      String response = "";
      if (responseCode == 200) {
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        response = in.readLine();
        System.out.println(response);
        in.close();
      } else {
        System.out.println("Bad code: " + responseCode);
      }

      if (!Objects.equals(response, "")) {
        Gson gson = new Gson();
        DogApi dogApi = gson.fromJson(response, DogApi.class);
        System.out.println(dogApi);

        URL dogPicUrl = new URL(dogApi.message);
        connection = (HttpURLConnection) dogPicUrl.openConnection();
        connection.setRequestMethod("GET");

        responseCode = connection.getResponseCode();
        if (responseCode == 200) {
          InputStream in = connection.getInputStream();
          FileOutputStream out = new FileOutputStream("dog.jpg");

          int i = in.read();
          while (i != -1) {
            out.write(i);
            i = in.read();
          }
          in.close();
          out.close();
        } else {
          System.out.println("bad code: " + responseCode);
        }
      } else {
        System.out.println("response is empty");
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
//    httpConnection();
//    task1();
    downloadDogPicture();
  }
}
