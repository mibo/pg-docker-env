FROM airhacks/payara-micro
MAINTAINER mibo@apache.org
# For more information about airhacks see: https://github.com/AdamBien/docklands/blob/master and https://hub.docker.com/r/airhacks/
COPY service.war ${DEPLOYMENT_DIR}
ENV ARCHIVE_NAME service.war
HEALTHCHECK --interval=15s CMD curl --fail http://localhost:8080/ping/resources/pings/echo/+ || exit 1