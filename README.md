# poky_qemu_arm
Determine if the updated exe can 

cd .../poky_qemu_arm/
. ./poky/oe-init-build-env  ./build
now clean up the old installer.
#clean up the previous version the returned "hello world"
bitbake -f -c cleansstate helloworld
#cd to source dir change the text and run bitback again
bitbake helloworld
#cd to location of pckage
./tmp/deploy/ipk/armv5e/
#scp the file 
#cd to the location of the package 
#.../poky_qemu_arm/build/tmp/deploy/ipk/armv5e$ 
#copy the file to a now running emulatore
scp helloworld_1.0-r0_armv5e.ipk root@192.168.7.2:/tmp
#on the emulator run
opkg install /tmp/helloworld_1.0-r0_arm5e.ipk --force-install.
#run the comman and check for changes.
