# Jacoco

Repositório feito apenas com a intenção de testar o **Jacoco**

# Ferramentas
+ Spring
+ Spring Boot
+ Spring Web
+ H2
+ Oauth2

# Plugin do Jacoco
```xml
<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.13</version>

				<configuration>
					<excludes>
						<exclude>com/example/dscommerce/DscommerceApplication.class</exclude>
						<exclude>com/example/dscommerce/config/**</exclude>
						<exclude>com/example/dscommerce/entities/**</exclude>
						<exclude>com/example/dscommerce/dto/**</exclude>
						<exclude>com/example/dscommerce/controllers/handlers/**</exclude>
						<exclude>com/example/dscommerce/services/exceptions/**</exclude>
						<exclude>com/example/dscommerce/util/**</exclude>
						<exclude>com/example/dscommerce/controllers/**</exclude>
					</excludes>
				</configuration>

				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>jacoco-report</id>
						<phase>prepare-package</phase>
						<goals>
							<goal>report</goal>
						</goals>
						<configuration>
							<outputDirectory>target/jacoco-report</outputDirectory>
						</configuration>
					</execution>
				</executions>
			</plugin>
```
