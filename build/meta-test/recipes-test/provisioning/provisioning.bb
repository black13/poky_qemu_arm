SUMMARY = "provisioning installer for camera types"
DEPENDS = ""
LICENSE = "CLOSED"


SRC_URI = "file://cameraOptions.json \
           file://cameraProperties.json \
           file://calibrationSpectra.json \
           file://materialSpectra.json \
"
S = "${WORKDIR}"

INHIBIT_DEFAULT_DEPS = "1"

do_compile() {
}

do_install() {
    install -d ${D}${sysconfdir}/MultiSensor
    install -m 0644 ${WORKDIR}/cameraOptions.json ${D}${sysconfdir}/MultiSensor/cameraOptions.json
    install -m 0644 ${WORKDIR}/cameraProperties.json ${D}${sysconfdir}/MultiSensor/cameraProperties.json
    install -m 0644 ${WORKDIR}/calibrationSpectra.json ${D}${sysconfdir}/MultiSensor/calibrationSpectra.json
}

