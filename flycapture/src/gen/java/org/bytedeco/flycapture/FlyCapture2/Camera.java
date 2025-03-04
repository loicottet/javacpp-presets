// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;

    /**
     * The Camera object represents a physical camera that uses the IIDC
     * register set. The object must first be connected to using Connect()
     * before any other operations can proceed.
     *
     * It is possible for more than 1 Camera object to connect to a single
     * physical camera. However, isochronous transmission to more than
     * 1 Camera object is not supported.
     *
     * \nosubgrouping
     */
    @Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class Camera extends CameraBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Camera(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Camera(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Camera position(long position) {
            return (Camera)super.position(position);
        }
    

            /**
             * Default constructor.
             */
            public Camera() { super((Pointer)null); allocate(); }
            private native void allocate();

            /**
             * Default destructor.
             */

            /**
             * \name DCAM Formats
             *
             * These functions deal with DCAM video mode and frame rate
             * on the camera. They are only used for firewire and usb2 cameras.
             */
            /*@{*/

            /**
             * Query the camera to determine if the specified video mode and
             * frame rate is supported.
             *
             * @param videoMode Video mode to check.
             * @param frameRate Frame rate to check.
             * @param pSupported Whether the video mode and frame rate is
             *                   supported.
             *
             * @see GetVideoModeAndFrameRate()
             * @see SetVideoModeAndFrameRate()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error GetVideoModeAndFrameRateInfo(
                                @Cast("FlyCapture2::VideoMode") int videoMode,
                                @Cast("FlyCapture2::FrameRate") int frameRate,
                                @Cast("bool*") BoolPointer pSupported);
            public native @ByVal Error GetVideoModeAndFrameRateInfo(
                                @Cast("FlyCapture2::VideoMode") int videoMode,
                                @Cast("FlyCapture2::FrameRate") int frameRate,
                                @Cast("bool*") boolean[] pSupported);

            /**
             * Get the current video mode and frame rate from the camera. If
             * the camera is in Format7, the video mode will be VIDEOMODE_FORMAT7
             * and the frame rate will be FRAMERATE_FORMAT7.
             *
             * @param pVideoMode Current video mode.
             * @param pFrameRate Current frame rate.
             *
             * @see GetVideoModeAndFrameRateInfo()
             * @see SetVideoModeAndFrameRate()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error GetVideoModeAndFrameRate(
                                @Cast("FlyCapture2::VideoMode*") IntPointer pVideoMode,
                                @Cast("FlyCapture2::FrameRate*") IntPointer pFrameRate );
            public native @ByVal Error GetVideoModeAndFrameRate(
                                @Cast("FlyCapture2::VideoMode*") IntBuffer pVideoMode,
                                @Cast("FlyCapture2::FrameRate*") IntBuffer pFrameRate );
            public native @ByVal Error GetVideoModeAndFrameRate(
                                @Cast("FlyCapture2::VideoMode*") int[] pVideoMode,
                                @Cast("FlyCapture2::FrameRate*") int[] pFrameRate );

            /**
             * Set the specified video mode and frame rate to the camera. It is
             * not possible to set the camera to VIDEOMODE_FORMAT7 or
             * FRAMERATE_FORMAT7. Use the Format7 functions to set the camera
             * into Format7.
             *
             * @param videoMode Video mode to set to camera.
             * @param frameRate Frame rate to set to camera.
             *
             * @see GetVideoModeAndFrameRateInfo()
             * @see GetVideoModeAndFrameRate()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error SetVideoModeAndFrameRate(
                                @Cast("FlyCapture2::VideoMode") int videoMode,
                                @Cast("FlyCapture2::FrameRate") int frameRate );

            /*@}*/

            /**
             * \name Format7
             *
             * These functions deal with Format7 custom image control on the camera.
             */
            /*@{*/

            /**
             * Retrieve the availability of Format7 custom image mode and the
             * camera capabilities for the specified Format7 mode. The mode must
             * be specified in the Format7Info structure in order for the
             * function to succeed.
             *
             * @param pInfo Structure to be filled with the capabilities of the
             *              specified mode and the current state in the specified
             *              mode.
             * @param pSupported Whether the specified mode is supported.
             *
             * @see ValidateFormat7Settings()
             * @see GetFormat7Configuration()
             * @see SetFormat7Configuration()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error GetFormat7Info(
                                Format7Info pInfo,
                                @Cast("bool*") BoolPointer pSupported );
            public native @ByVal Error GetFormat7Info(
                                Format7Info pInfo,
                                @Cast("bool*") boolean[] pSupported );

            /**
             * Validates Format7ImageSettings structure and returns valid packet
             * size information if the image settings are valid. The current
             * image settings are cached while validation is taking place. The
             * cached settings are restored when validation is complete.
             *
             * @param pImageSettings Structure containing the image settings.
             * @param pSettingsAreValid Whether the settings are valid.
             * @param pPacketInfo Packet size information that can be used to
             *                    determine a valid packet size.
             *
             * @see GetFormat7Info()
             * @see GetFormat7Configuration()
             * @see SetFormat7Configuration()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error ValidateFormat7Settings(
                                @Const Format7ImageSettings pImageSettings,
                                @Cast("bool*") BoolPointer pSettingsAreValid,
                                Format7PacketInfo pPacketInfo );
            public native @ByVal Error ValidateFormat7Settings(
                                @Const Format7ImageSettings pImageSettings,
                                @Cast("bool*") boolean[] pSettingsAreValid,
                                Format7PacketInfo pPacketInfo );

            /**
             * Get the current Format7 configuration from the camera. This call
             * will only succeed if the camera is already in Format7.
             *
             * @param pImageSettings Current image settings.
             * @param pPacketSize Current packet size.
             * @param pPercentage Current packet size as a percentage.
             *
             * @see GetFormat7Info()
             * @see ValidateFormat7Settings()
             * @see SetFormat7Configuration()
             * @see GetVideoModeAndFrameRate()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error GetFormat7Configuration(
                                Format7ImageSettings pImageSettings,
                                @Cast("unsigned int*") IntPointer pPacketSize,
                                FloatPointer pPercentage );
            public native @ByVal Error GetFormat7Configuration(
                                Format7ImageSettings pImageSettings,
                                @Cast("unsigned int*") IntBuffer pPacketSize,
                                FloatBuffer pPercentage );
            public native @ByVal Error GetFormat7Configuration(
                                Format7ImageSettings pImageSettings,
                                @Cast("unsigned int*") int[] pPacketSize,
                                float[] pPercentage );

            /**
             * Set the current Format7 configuration to the camera.
             *
             * @param pImageSettings Image settings to be written to the camera.
             * @param packetSize Packet size to be written to the camera.
             *
             * @see GetFormat7Info()
             * @see ValidateFormat7Settings()
             * @see GetFormat7Configuration()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error SetFormat7Configuration(
                                @Const Format7ImageSettings pImageSettings,
                                @Cast("unsigned int") int packetSize );

            /**
             * Set the current Format7 configuration to the camera.
             *
             * @param pImageSettings Image settings to be written to the camera.
             * @param percentSpeed Percentage of packet size to be written to
             *                     the camera.
             *
             * @see GetFormat7Info()
             * @see ValidateFormat7Settings()
             * @see GetFormat7Configuration()
             *
             * @return An Error indicating the success or failure of the function.
             */
            public native @ByVal Error SetFormat7Configuration(
                                @Const Format7ImageSettings pImageSettings,
                                float percentSpeed );

            /*@}*/

            /**
             * The following functions are inherited from CameraBase. See
             * CameraBase.h for further information.
             */

            public native @ByVal Error Connect( PGRGuid pGuid/*=NULL*/ );
            public native @ByVal Error Connect( );
            public native @ByVal Error Disconnect();
            public native @Cast("bool") boolean IsConnected();
            public native @ByVal Error SetCallback(
                                ImageEventCallback callbackFn,
                                @Const Pointer pCallbackData/*=NULL*/ );
            public native @ByVal Error SetCallback(
                                ImageEventCallback callbackFn );
            public native @ByVal Error StartCapture(
                                ImageEventCallback callbackFn/*=NULL*/,
                                @Const Pointer pCallbackData/*=NULL*/ );
            public native @ByVal Error StartCapture( );
            public static native @ByVal Error StartSyncCapture(
                                @Cast("unsigned int") int numCameras,
                                @Cast("const FlyCapture2::Camera**") PointerPointer ppCameras,
                                @Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
                                @Cast("const void**") PointerPointer pCallbackDataArray/*=NULL*/ );
            public static native @ByVal Error StartSyncCapture(
                                @Cast("unsigned int") int numCameras,
                                @Const @ByPtrPtr Camera ppCameras );
            public static native @ByVal Error StartSyncCapture(
                                @Cast("unsigned int") int numCameras,
                                @Const @ByPtrPtr Camera ppCameras,
                                @Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
                                @Cast("const void**") @ByPtrPtr Pointer pCallbackDataArray/*=NULL*/ );
            public native @ByVal Error RetrieveBuffer( Image pImage );
            public native @ByVal Error StopCapture();
            public native @ByVal Error WaitForBufferEvent( Image pImage, @Cast("unsigned int") int eventNumber );
            public native @ByVal Error SetUserBuffers(
                                @Cast("unsigned char*const") BytePointer pMemBuffers,
                                int size,
                                int numBuffers );
            public native @ByVal Error SetUserBuffers(
                                @Cast("unsigned char*const") ByteBuffer pMemBuffers,
                                int size,
                                int numBuffers );
            public native @ByVal Error SetUserBuffers(
                                @Cast("unsigned char*const") byte[] pMemBuffers,
                                int size,
                                int numBuffers );
            public native @ByVal Error GetConfiguration( FC2Config pConfig );
            public native @ByVal Error SetConfiguration( @Const FC2Config pConfig );
            public native @ByVal Error GetCameraInfo( CameraInfo pCameraInfo );
            public native @ByVal Error GetPropertyInfo( PropertyInfo pPropInfo );
            public native @ByVal Error GetProperty( Property pProp );
            public native @ByVal Error SetProperty(
                                @Const Property pProp,
                                @Cast("bool") boolean broadcast/*=false*/ );
            public native @ByVal Error SetProperty(
                                @Const Property pProp );
            public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntPointer pDirection);
            public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntBuffer pDirection);
            public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") int[] pDirection);
            public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction, @Cast("bool") boolean broadcast/*=false*/ );
            public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction );
            public native @ByVal Error GetTriggerModeInfo( TriggerModeInfo pTriggerModeInfo );
            public native @ByVal Error GetTriggerMode( TriggerMode pTriggerMode );
            public native @ByVal Error SetTriggerMode(
                                @Const TriggerMode pTriggerMode,
                                @Cast("bool") boolean broadcast/*=false*/ );
            public native @ByVal Error SetTriggerMode(
                                @Const TriggerMode pTriggerMode );
            public native @ByVal Error FireSoftwareTrigger( @Cast("bool") boolean broadcast/*=false*/ );
            public native @ByVal Error FireSoftwareTrigger( );
            public native @ByVal Error GetTriggerDelayInfo( @Cast("FlyCapture2::TriggerDelayInfo*") PropertyInfo pTriggerDelayInfo );
            public native @ByVal Error GetTriggerDelay( @Cast("FlyCapture2::TriggerDelay*") Property pTriggerDelay );
            public native @ByVal Error SetTriggerDelay(
                                @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay,
                                @Cast("bool") boolean broadcast/*=false*/ );
            public native @ByVal Error SetTriggerDelay(
                                @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay );
            public native @ByVal Error GetStrobeInfo( StrobeInfo pStrobeInfo );
            public native @ByVal Error GetStrobe( StrobeControl pStrobeControl );
            public native @ByVal Error SetStrobe(
                                @Const StrobeControl pStrobeControl,
                                @Cast("bool") boolean broadcast/*=false*/ );
            public native @ByVal Error SetStrobe(
                                @Const StrobeControl pStrobeControl );
            public native @ByVal Error GetLUTInfo( LUTData pData );
            public native @ByVal Error GetLUTBankInfo(
                                @Cast("unsigned int") int bank,
                                @Cast("bool*") BoolPointer pReadSupported,
                                @Cast("bool*") BoolPointer pWriteSupported );
            public native @ByVal Error GetLUTBankInfo(
                                @Cast("unsigned int") int bank,
                                @Cast("bool*") boolean[] pReadSupported,
                                @Cast("bool*") boolean[] pWriteSupported );
            public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntPointer pActiveBank );
            public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntBuffer pActiveBank );
            public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") int[] pActiveBank );
            public native @ByVal Error SetActiveLUTBank( @Cast("unsigned int") int activeBank );
            public native @ByVal Error EnableLUT( @Cast("bool") boolean on );
            public native @ByVal Error GetLUTChannel(
                                @Cast("unsigned int") int bank,
                                @Cast("unsigned int") int channel,
                                @Cast("unsigned int") int sizeEntries,
                                @Cast("unsigned int*") IntPointer pEntries );
            public native @ByVal Error GetLUTChannel(
                                @Cast("unsigned int") int bank,
                                @Cast("unsigned int") int channel,
                                @Cast("unsigned int") int sizeEntries,
                                @Cast("unsigned int*") IntBuffer pEntries );
            public native @ByVal Error GetLUTChannel(
                                @Cast("unsigned int") int bank,
                                @Cast("unsigned int") int channel,
                                @Cast("unsigned int") int sizeEntries,
                                @Cast("unsigned int*") int[] pEntries );
            public native @ByVal Error SetLUTChannel(
                                @Cast("unsigned int") int bank,
                                @Cast("unsigned int") int channel,
                                @Cast("unsigned int") int sizeEntries,
                                @Cast("const unsigned int*") IntPointer pEntries );
            public native @ByVal Error SetLUTChannel(
                                @Cast("unsigned int") int bank,
                                @Cast("unsigned int") int channel,
                                @Cast("unsigned int") int sizeEntries,
                                @Cast("const unsigned int*") IntBuffer pEntries );
            public native @ByVal Error SetLUTChannel(
                                @Cast("unsigned int") int bank,
                                @Cast("unsigned int") int channel,
                                @Cast("unsigned int") int sizeEntries,
                                @Cast("const unsigned int*") int[] pEntries );
            public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntPointer pCurrentChannel );
            public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntBuffer pCurrentChannel );
            public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") int[] pCurrentChannel );
            public native @ByVal Error SaveToMemoryChannel( @Cast("unsigned int") int channel );
            public native @ByVal Error RestoreFromMemoryChannel( @Cast("unsigned int") int channel );
            public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntPointer pNumChannels );
            public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntBuffer pNumChannels );
            public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") int[] pNumChannels );
            public native @ByVal Error GetEmbeddedImageInfo( EmbeddedImageInfo pInfo );
            public native @ByVal Error SetEmbeddedImageInfo( EmbeddedImageInfo pInfo );
            public native @ByVal Error WriteRegister(
                                @Cast("unsigned int") int address,
                                @Cast("unsigned int") int value,
                                @Cast("bool") boolean broadcast/*=false*/);
            public native @ByVal Error WriteRegister(
                                @Cast("unsigned int") int address,
                                @Cast("unsigned int") int value);
            public native @ByVal Error ReadRegister(
                                @Cast("unsigned int") int address,
                                @Cast("unsigned int*") IntPointer pValue );
            public native @ByVal Error ReadRegister(
                                @Cast("unsigned int") int address,
                                @Cast("unsigned int*") IntBuffer pValue );
            public native @ByVal Error ReadRegister(
                                @Cast("unsigned int") int address,
                                @Cast("unsigned int*") int[] pValue );
            public native @ByVal Error WriteRegisterBlock(
                                @Cast("unsigned short") short addressHigh,
                                @Cast("unsigned int") int addressLow,
                                @Cast("const unsigned int*") IntPointer pBuffer,
                                @Cast("unsigned int") int length );
            public native @ByVal Error WriteRegisterBlock(
                                @Cast("unsigned short") short addressHigh,
                                @Cast("unsigned int") int addressLow,
                                @Cast("const unsigned int*") IntBuffer pBuffer,
                                @Cast("unsigned int") int length );
            public native @ByVal Error WriteRegisterBlock(
                                @Cast("unsigned short") short addressHigh,
                                @Cast("unsigned int") int addressLow,
                                @Cast("const unsigned int*") int[] pBuffer,
                                @Cast("unsigned int") int length );
            public native @ByVal Error ReadRegisterBlock(
                                @Cast("unsigned short") short addressHigh,
                                @Cast("unsigned int") int addressLow,
                                @Cast("unsigned int*") IntPointer pBuffer,
                                @Cast("unsigned int") int length );
            public native @ByVal Error ReadRegisterBlock(
                                @Cast("unsigned short") short addressHigh,
                                @Cast("unsigned int") int addressLow,
                                @Cast("unsigned int*") IntBuffer pBuffer,
                                @Cast("unsigned int") int length );
            public native @ByVal Error ReadRegisterBlock(
                                @Cast("unsigned short") short addressHigh,
                                @Cast("unsigned int") int addressLow,
                                @Cast("unsigned int*") int[] pBuffer,
                                @Cast("unsigned int") int length );
            public static native @Cast("const char*") BytePointer GetRegisterString( @Cast("unsigned int") int registerVal);
            public native @ByVal Error GetCycleTime(TimeStamp timeStamp);
            public native @ByVal Error GetStats( CameraStats pStats );
            public native @ByVal Error ResetStats();

            public native @ByVal Error RegisterEvent( EventOptions pOpts );
            public native @ByVal Error DeregisterEvent( EventOptions pOpts );
            public native @ByVal Error RegisterAllEvents( EventOptions pOpts );
            public native @ByVal Error DeregisterAllEvents( );

    }
