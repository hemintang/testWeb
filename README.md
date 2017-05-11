<plugin>
        <groupId>org.mortbay.jetty</groupId>
        <artifactId>maven-jetty-plugin</artifactId>
        <version>6.1.22</version>
        <configuration>
          <!--<connectors>-->
          <!--<connector implementation="org.mortbay.jetty.nio.SelectChannelConnector">-->
          <!--<port>8080</port>&lt;!&ndash;端口号&ndash;&gt;-->
          <!--</connector>-->
          <!--</connectors>-->
          <scanIntervalSeconds>10</scanIntervalSeconds>
          <stopKey>foo</stopKey>
          <stopPort>9999</stopPort>
        </configuration>
        <executions>
          <execution>
            <id>start-jetty</id>
            <phase>pre-integration-test</phase>
            <goals>
              <goal>run</goal>
            </goals>
            <configuration>
              <scanIntervalSeconds>0</scanIntervalSeconds>
              <daemon>true</daemon>
            </configuration>
          </execution>
          <execution>
            <id>stop-jetty</id>
            <phase>post-integration-test</phase>
            <goals>
              <goal>stop</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      
      mvn clean jetty:tun
