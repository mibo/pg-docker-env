FROM airhacks/payara-micro
MAINTAINER mibo@apache.org
# For more information about airhacks see: https://github.com/AdamBien/docklands/blob/master and https://hub.docker.com/r/airhacks/
COPY target/pg-jee-service.war ${DEPLOYMENT_DIR}
ENV ARCHIVE_NAME pg-jee-service.war
# Healthcheck not yet enabled
#HEALTHCHECK --interval=15s CMD curl --fail http://localhost:8080/service/health/+ || exit 1