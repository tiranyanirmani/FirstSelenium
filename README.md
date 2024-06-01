In the realm of hands-on exploration, I orchestrated my project’s inception within the dynamic confines of Intelij IDEA, sculpting the digital landscape with finesse and precision.

Embark on your journey by traversing the digital corridors of the File menu, where you’ll unveil the gateway to creation. Navigate to the sacred realm of New, and with a click imbued with purpose, summon forth the genesis of your project. There, amidst the ether of possibilities, bestow upon it a name that echoes with ambition and a location that speaks to its destined path. And should your aspirations soar to the heights of Maven repositories, weave the intricate tapestry of GroupID, a beacon guiding your creations to the eyes of the world.

After that our New Project created like this

Then we need to download these libraries,

    I go to Selenium Java official page : https://www.selenium.dev/downloads/

2. TestNG : https://testng.org/#_download

This method is like going to different shops , when I want coconut, I go to coconut 🥥 shop. When I want fruits 🍏, I go to fruits shop likewise. Now what we do ? Are we going to different shops 🏪 ? we going to supermarkets 🛒 . It's called Mevan Repositories.

But we don’t want to download libraries like this, we can use Maven Repositories official website . Then type Selenium java and click search.

Then go to the pom.xml file & paste this dependency like this,

Then type WebDriverManager in Mevan Repository official page . Usually we use the latest versions .

Then type testNG in Mevan Repository official page.

Then go to the Swag Labs

This is the testcase for the day. Then check whether this ‘Product’ is there.

Now all the downloading stuff over and then the next step is to create a class in test area. Select the Java of your project folder , right click New ,then go to Package. Package names, there is a naming convention. for an example normally ,when we write names ,the first letter is capital but here according to the naming convention whole letters are writing in simple

Now we create new class, right click on the package then go to New ,and click on Java Class then give the name as ‘HelloSelenium’ . Now we will start our first test. Annotations, TestNG got lots of annotations . I’ll be using first one , @Test annotation type and we can see the testng annotation will automatically shows the related annotations in intellij IDEA. All the possible annotations listed. I clicked the first one & then automatically the import statement is coming. So that's very important.

According to that when we run this code, we can see that the Chrome browser will automatically opens & closes also automatically.
