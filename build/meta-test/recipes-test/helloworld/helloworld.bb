DESCRIPTION = "Example Hello, World application for Yocto build."
SECTION = "examples"
DEPENDS = ""
LICENSE = "CLOSED"
FILESEXTRAPATHS_prepend := "${THISDIR}/src:"

SRC_URI = "file://helloworld.c"

S = "${WORKDIR}"

do_compile() {
${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/helloworld.c -o helloworld
}

do_install() {
# create the /usr/bin folder in the rootfs with default permissions
install -d ${D}${bindir}

# install the application into the /usr/bin folder with default permissions
install ${WORKDIR}/helloworld ${D}${bindir}
}
