# Pull base image
FROM tomcat

# Maintainer
MAINTAINER "sandeepkmv@gmail.com">

# Copy to images tomcat path
ADD EmployeeWeb.war /usr/local/tomcat/webapps

EXPOSE 8080

CMD ["catalina.sh", "run"]